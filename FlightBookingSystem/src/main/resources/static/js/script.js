$(document).ready(function() {
	$('.drop-click').click(function() {
		$(this).closest('.spidy-hook').toggleClass('grid');
		$(this).closest('.spidy-hook').find('.ticket-drop').stop().slideToggle();
		});
		});