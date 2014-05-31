function init() {
	$('.movestone').draggable();
}


function whiteStone() {
	var white_stone = new Array();
	for ( i = 0; i < 15; i++) {
		var src = document.getElementById("nardy");
		var img = document.createElement("img");
		img.style.right = "82px";
	    img.src = "images/qar.png";
		img.setAttribute("class", "movestone" );
		src.appendChild(img);
		img.style.top = (i + 1) * 20 + 'px';
        white_stone.push(src);
	}
	$(init);
}

function redStone() {
	var img1 = document.createElement("img");
	var red_stone = new Array();
	for ( i = 0; i < 15; i++) {
		var src = document.getElementById("nardy");
		var img1 = document.createElement("img");
		img1.style.left = "82px";
		img1.src = "images/qar1.png";
		src.appendChild(img1);
		img1.setAttribute("class", "movestone" );
		red_stone.push(src);
		img1.style.top = (470 - 20 * (i + 1)) + 'px';
}
$(init);

}
