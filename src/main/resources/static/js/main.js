$("#setLast4DigitsAsPin").on("click", function() {
	var cb1 = $('#setLast4DigitsAsPin').is(':checked');
	$('#clearPin').prop('disabled', cb1);
	$('#clearPin').prop('value', null);
});
