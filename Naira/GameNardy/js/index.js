window.onload=function(){
var tb1 = document.getElementById("table1ID");

			for (var i1 = 0; i1 < 18; i1++) {
			var tr = document.createElement('tr');
			
				for (var j = 0; j < 14; j++) {
				var td = document.createElement('td');
				td.setAttribute("id", "element" + i1 + j);
				tr.appendChild(td);
			
				tb1.appendChild(tr);}
 
//document.getElementsByTagName("td")[j].onclick = function() {  return true;};
		}
	tds = document.getElementsByTagName("td");
for( var x=0; x < tds.length; x++ ) {
tds[x].onclick = function(){
	
this.innerHTML="";
};
}
}


function init() {
	$('.movestone').draggable();
}
function GameBord(){

}
function PlaceStone(){

}
PlaceStone.prototype.stone=function(){

}
var placestone=new PlaceStone();
var obj={"place":[placestone.stone(),placestone.stone(),placestone.stone()]};


function whiteStone() {

var white_stone = new Array();
	for ( i = 0; i < 15; i++) {
		var src = document.getElementById("element"+i+"13");
		
		var img = document.createElement("img");
		//img.style.right = "2px";
	    img.src = "images/qar.png";
		img.setAttribute("class", "movestone" );
	    src.appendChild(img);
        white_stone.push(src);
	}
	$(init);

}

function redStone() {

	var red_stone = new Array();
	for ( i = 3; i < 18; i++) {
		var src = document.getElementById("element"+i+"0");
		var img = document.createElement("img");
		//img.style.right = "2px";
	    img.src = "images/qar1.png";
		img.setAttribute("class", "movestone" );
	    src.appendChild(img);
        red_stone.push(src);
	}
	$(init);


}
function clickZar(){
var zar={"zarimg":[{"srcimg":'images/zar1.png',"imgindex":1},{"srcimg":'images/zar2.png',"imgindex":2},{"srcimg":'images/zar3.png',"imgindex":3},{"srcimg":'images/zar4.png',"imgindex":4},{"srcimg":'images/zar5.png',"imgindex":5},{"srcimg":'images/zar6.png',"imgindex":6}]};
var math=Math.floor((Math.random() * zar.zarimg.length));
var math1=Math.floor((Math.random() * zar.zarimg.length));
var zardiv = document.getElementById("zar");
var img = document.createElement("img");
img.src=zar.zarimg[math].srcimg;
var img1 = document.createElement("img");
img1.src=zar.zarimg[math1].srcimg;;
zardiv.appendChild(img);		
zardiv.appendChild(img1);
}
