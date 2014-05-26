window.onload = function() {

}
var l;
var j = 0;
function Play() {

	var tb1 = document.getElementById("table1ID");
	var tb2 = document.getElementById("table2ID");
	for ( k = 0; k < 2; k++) {

		for (var i = 0; i < 10; i++) {
			var tr = document.createElement('tr');

			for (var j = 0; j < 10; j++) {

				if (k == 0) {
					var td = document.createElement('td');
					td.setAttribute("id", "td" + k + i + j);
					tr.appendChild(td);
					tb1.appendChild(tr);

				} else {
					var td = document.createElement('td');
					td.setAttribute("id", "td" + k + i + j);
					tr.appendChild(td);
					tb2.appendChild(tr);

				}
			}
		}
	}

	document.getElementById("but").style.display = "none";
	document.getElementById("imgId").style.display = "none";
	ship(4);
	ship(3);
	ship(3);
	ship(2);
	ship(2);
	ship(2);
	ship(1);
	ship(1);
	ship(1);
	ship(1);
}

function ship(n) {

	var ul = document.getElementById("ulId" + j);
	for (var i = 0; i < n; i++) {
		var li = document.createElement('li');
		li.setAttribute("id", "liId" + j + i);
		var img = document.createElement('img');
		img.src = "images/ok.png";
		li.appendChild(img);
		ul.appendChild(li);

	}
	j++;
	ul.style.left = (1 + j) * 60 + 'px';
	ul.onclick = function() {
	clickTable(n, this);

	}
}

function clickTable(n, y) {
	var k = 0;
	tds = document.getElementsByTagName("td");
	for (var x = 0; x < tds.length / 2; x++) {
		tds[x].onclick = function() {
			var tdId = this.id;
			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			if (n <= (10 - parseInt(stri)) && document.getElementById('td0' + stri + strj).innerHTML == "" && document.getElementById('td0' + (parseInt(stri) + n - 1) + strj).innerHTML == "") {
				//if(document.getElementById('td0' + stri + (parseInt(strj)-1)).innerHTML=="" && document.getElementById('td0' + stri + (parseInt(strj)+1)).innerHTML==""){
				for (var i = parseInt(stri); i < (parseInt(stri) + n); i++) {
					document.getElementById('td0' + i + strj).innerHTML = "<img src='images/ok.png' />";

				}

				k = 1;
				if (k == 1) {
					y.innerHTML = "";
				}
			}
			};
			//}
	}
	for (var x = tds.length / 2 ; x < tds.length; x++) {
		tds[x].onclick = function() {
			var tdId = this.id;
			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			if (document.getElementById('td0' + stri + strj).innerHTML != 0) {
				document.getElementById('td0' + stri + strj).innerHTML = "<img src='images/error.png' />";
				document.getElementById('td1' + stri + strj).innerHTML = "<img src='images/skeleton.png' />";
			}else{
				document.getElementById('td1' + stri + strj).innerHTML = "<img src='images/fuk.png' />";

			}

		}
	}
}
