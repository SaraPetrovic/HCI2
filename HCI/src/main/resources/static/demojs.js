

// Get the modal
var button = document.getElementById('button');
var tule = document.getElementById('aha');
var dule = document.getElementById('dule');
// Get the button that opens the modal
var btn = document.getElementById("demo");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
function showModal(target, offsetHX, offsetHY,offsetMX, offsetMY, message){
	var save = document.getElementById(target);
    var pos = save.getBoundingClientRect();

	$("#modal-content").css("left", pos.left + offsetMX + 'px');
	$("#modal-content").css("top", pos.top + offsetMY + 'px');
	$("#" + target).clone().appendTo($("#highlight"));
	$("#highlight").css("left", pos.left + offsetHX +  'px');
	$("#highlight").css("top", pos.top + offsetHY +'px');

	$("#demo-message").text(message);
	$('#demo-modal').show();

}

// When the user clicks on <span> (x), close the modal


// When the user clicks anywhere outside of the modal, close it

function emptyModal(){

	$('#demo-modal').css("display", "none");
	$('#highlight').empty();

}

