const api = 'https://api.themoviedb.org/3/search/movie';
const apiKey = 'eb862ab2ce450a481770834414f92c02';
const apiImageUrl = 'https://image.tmdb.org/t/p/w200';

// ready method is depreciated and might not available on future jquery version
// $(document).ready(function(){
//
// });

// using new jquery method
jQuery(function ($) {
  const error = $('#error');
  const searchBtn = $('#search_btn');
  const searchInput = $('#search_input');
  const listContainer = $('#list_container');

  //Binding click event to search box.
  searchBtn.on('click', () => {
    const searchText = searchInput.val();  // getting input value from input form. calling  jQuery val() function on input.
    if (searchText == '') {
      error.txt("Search box is empty"); // by default error box is empty, inserting txt to it.
      error.show(300);                  //by default error element is hidden, showing it by calling jQuery show() function.
    } else if (searchText < 3) {
      error.txt("Please provide at least 3 letters"); // insert txt to error.
      error.show(300);                                //  showing #error.
    }
    else {
      // userinput is valid
      // time to make a fetch request to API and get JSON data.

      // defining query string as obj
      const movieApiSettings = {
        query: searchText,
        api_key: apiKey
      };
      $.getJSON(api, movieApiSettings)
        .then((res) => {
          //we got the list of movies
          //time to print movie list on page
          //step 1: remove old results if any
          listContainer.empty();
          //creating new element
          let ul = $('<ul/>');
          //looping through all the movie items.
          res.result.forEach((movie) => {
            //creating new element list
            let li = $('<li/>');

            const imgContainer = $('<div/>');
            const imgElement = $('<img/>');
            // Adding attribute
            imgElement.attr('width', 150);
            imgElement.attr('height', 150);
            imgElement.attr('src', apiImageUrl + movie.poster_path); // setting attribute to image element
            imgContainer.append(imgElement);
            li.append(imgContainer);

            const detailsConainer = $('<div/>');
            const detailsLink = $('<a/>');
            detailsLink.attr('target', '_blank');
            detailsLink.attr('herf', './movie_details.html?movieId=' + movie.id);
            detailsLink.txt(movie.title);
            detailsConainer.append(detailsLink);
            detailsReleaseDate.txt('Release Date: ', +movie.release_date);
            detailsReleaseDate.css('font-style', 'italic'); // adding style to element using .css()
            detailsConainer.append(detailsReleaseDate);

            const detailsOverview = $('<p/>');
            detailsOverview.txt(movie.overview.slice(0, 300) + '.....');
            detailsConainer.append(detailsOverview);
            li.append(detailsConainer); // appending to list

            const ratingContainer = $('<div/>');
            const ratingH5 = $('<h5/>');
            ratingH5.txt('Rating (' + movie.vote_average + ')');
            ratingContainer.append(ratingH5);

            const ratingProgress = $('<progress/>');
            ratingProgress.attr('max', '100');// setting attribute to image element
            ratingProgress.attr('value', movie.vote_average * 10);
            ratingContainer.append(ratingProgress);
            li.append(ratingContainer); // appending to list

            ul.append(li); // appending newly created list to UL

          });
          console.log(ul);
          listContainer.append(ul);
        })
        .catch(err => {
          console.log(err);
        })

    }
  });
  // Event binding on search input
  searchInput.on('input', () =>{
    error.hide(300); // hiding #error when user input anything on #searchinput
  })
  $(documnet).on('keypress', (evt) =>{
    if(evt.which === 13){
      searchBtn.trigger('click');
    }
  })

});