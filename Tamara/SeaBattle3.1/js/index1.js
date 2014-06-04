var j = 0;
var countShips = 0;
function Ship() {
	this.infoship = {
		"ship" : [{
			"count" : 1,
			"size" : 4,
			"state" : true
		}, {
			"count" : 2,
			"size" : 3,
			"state" : true
		}, {
			"count" : 3,
			"size" : 2,
			"state" : true
		}, {
			"count" : 4,
			"size" : 1,
			"state" : true
		}]
	}
}

function startGame() {
	document.getElementById("but").style.display = "block";
	createTables();
	var s = new Ship();
	for ( i = 0; i < 4; i++) {
		s.createShips(s.infoship.ship[i].count, s.infoship.ship[i].size);

	}
	moveShip();
	document.getElementById("game").style.display = "none";

}

function Play() {
	if (countShips == 10) {
		Ship.prototype.clickTabel2();
		document.getElementById("but").style.display = "none";
	} else {
		alert("Please move all ships in the table");
	}

}

function createTables() {

	var tb1 = document.getElementById("table1ID");
	var tb2 = document.getElementById("table2ID");
	for ( k = 0; k < 2; k++) {
		for (var i = 0; i < 10; i++) {
			var tr = document.createElement('tr');
			for (var j = 0; j < 10; j++) {
				var td = document.createElement('td');
				if (k == 0) {
					td.setAttribute("id", "td" + k + i + j);
					tr.appendChild(td);
					tb1.appendChild(tr);
				} else {

					td.setAttribute("id", "td" + k + i + j);
					tr.appendChild(td);
					tb2.appendChild(tr);
				}
			}
		}
	}
}

Ship.prototype.createShips = function(count, size) {

	for (var h = 0; h < count; h++) {
		var ul = document.getElementById("ulId" + j);
		for (var p = 0; p < size; p++) {
			var li = document.createElement('li');
			li.setAttribute("id", "liId" + j + p);
			var img = document.createElement('img');
			img.src = "images/ok.png";
			li.appendChild(img);
			ul.appendChild(li);
		}
		j++;
		ul.style.left = (1 + j) * 60 + 'px';

	}
}
function moveShip() {
	var countChildren;
	for (var h = 0; h < 10; h++) {
		ulID = document.getElementById('ulId' + h);
		ulID.onclick = function() {
			countChildren = this.children.length;
			Ship.prototype.clickTable1(countChildren, this);
		}
	}
}

Ship.prototype.clickTable1 = function(size, position) {

	var t = true;
	tds = document.getElementsByTagName("td");
	for ( j = 0; j < tds.length / 2; j++) {
		tds[j].onclick = function() {
			var tdId = this.id;

			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			var si = parseInt(stri);
			if (size <= (10 - si) && document.getElementById('td0' + stri + strj).innerHTML == "" && document.getElementById('td0' + (si + size - 1) + strj).innerHTML == "") {
				for (var i = si; i < si + size; i++) {

					if (t) {
						document.getElementById('td0' + i + strj).innerHTML = "<img src='images/ok.png' />";
					}

				}
				t = false;
				position.innerHTML = "";
				countShips++;

			}
		};
	}
}
Ship.prototype.clickTabel2 = function() {
	var up = true;
	var down = true;
	tds = document.getElementsByTagName("td");
	for (var x = tds.length / 2; x < tds.length; x++) {
		tds[x].onclick = function() {
			var tdId = this.id;
			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			var si = parseInt(stri);
			var tt = si - 100;
			var sj = parseInt(strj);
			var sij = stri + strj;
			if (document.getElementById('td0' + sij).innerHTML != 0) {
				if (document.getElementById('td0' + si + sj).innerHTML != "" && document.getElementById('td0' + (si + 1) + sj).innerHTML == "") {
					down = false;

				}

				if (document.getElementById('td0' + si + sj).innerHTML != "" && document.getElementById('td0' + (si - 1) + sj).innerHTML == "") {
					up = false;

				}
				if (up == false && down == false) {

					alert("Ship is wrecked");
					up = true;
					down = true;
				}
				document.getElementById('td0' + sij).innerHTML = "<img src='images/error.png' />";
				document.getElementById('td1' + sij).innerHTML = "<img src='images/skeleton.png' />";

			} else {
				document.getElementById('td1' + sij).innerHTML = "<img src='images/fuk.png' />";

			}

		}
	}
}

