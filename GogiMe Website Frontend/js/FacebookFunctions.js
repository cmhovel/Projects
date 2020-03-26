//automatically hides all the navbar links on page load
$(".navbarlinks").hide();

//on clicking the hamburger menu all navbar links will appear
$(".hamburger-menu").click(function(){
	$(".navbarlinks").toggle();
});