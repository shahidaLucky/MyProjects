// const api = 'https://api.themoviedb.org/3/search/movie';
const api = 'https://api.themoviedb.org/3/movie/';
const apiKey = 'eb862ab2ce450a481770834414f92c02';
const apiImageUrl = 'https://image.tmdb.org/t/p/w200';

// using new jquery method
jQuery(function ($) {
  const movieId = window.location.search.split('=')[1];
  if (movieId) {
    const movieApiSettings = {
      api_key: apiKey,
      append_to_response: "credits",
    };

    // we are making this request on page load.
    // on index.html page, we made ajax request on click
    // but here I need to do this automatically.
    $.getJSON(api + movieId, movieApiSettings)
      .then(res => {
        const detailsContainer = $('#details_container');
        const detailsImageContainer = $('<div/>');

        const imageContainer = $('<div/>');
        const img = $('<img/>');
        img.height(400);
        img.width(400);
        img.attr('src', apiImageUrl + res.poster_path);
        imageContainer.append(img);
        detailsImageContainer.append(imageContainer);
        detailsContainer.append(detailsImageContainer);

        const details = $('<div/>');
        const title = $('<h3/>').text(res.title);
        details.append(title);
        const status = $('<h5/>').text('Status: ' + res.status);
        details.append(status);
        const releaseDate = $('<h5/>').text('Release Date: ' + res.release_date);
        details.append(releaseDate);
        const genres = $('<h5/>').text('Genres: ' + res.genres.map((g) => g.name).join(", "));
        details.append(genres);
        const overview = $('<p/>').text(res.overview);
        details.append(overview);

        detailsContainer.append(details);

        // for cast, we need to loop through cast list
        const castContainer = $('#cast_container');
        const castUl = $('<ul/>');
        res.credits.cast.forEach((cast) => {
          const li = $('<li/>');
          const castImg = $('<img/>');
          castImg.height(300);
          castImg.width(200);
          castImg.attr('src', apiImageUrl + cast.profile_path); // hardcoded for now
          li.append(castImg);
          const castCharacter = $('<h4/>');
          castCharacter.text(cast.character);
          li.append(castCharacter);
          const castOriginal = $('<h5/>');
          castOriginal.text(cast.name);
          li.append(castOriginal);
          castUl.append(li);
        });
        castContainer.append(castUl);


      })
      .catch();


  } else {
    // no movie id found. redirect user to index.page
    window.location = './index.html';
  }
});
