$(document).ready(function() {
	const error = $("#error");
	error.hide();
	$('#download').on('click', function(){
		const q1 = $('#q1').val();
		const q2 = $('#q2').val();
		const q3 = $('#q3').val();
		const q4 = $('#q4').val();
		const q5 = $('#q5').val();
		const q6 = $('#q6').val();
		const q7 = $('#q7').val();
		const q8 = $('#q8').val();
		if(
				q1=== 'no' || 
				q2=== 'no' || 
				q3=== 'no' || 
				q4=== 'no' || 
				q5=== 'no' || 
				q6=== 'no' || 
				q7=== 'no' || 
				q8=== 'no'
		)
		{
			console.log("Hello");
			error.show();
		}else{
			// download pdf			
			window.location = 'assets/eligilibility.pdf';
		}		
	});	
});