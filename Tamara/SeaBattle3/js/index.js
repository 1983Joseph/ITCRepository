var arr = new Array();
var j = 0;
function Ship() {
	this.infoship = {
		"info" : [{
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

function Play() {
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
	document.getElementById("but").style.display = "none";
	document.getElementById("imgId").style.display = "none";
	var a = new Ship();
	for ( i1 = 0; i1 < 4; i1++) {
		a.createShip(a.infoship.info[i1].count, a.infoship.info[i1].size);

	}
}

Ship.prototype.createShip = function(count, sizeship) {

	for (var h = 0; h < count; h++) {
		var ul = document.getElementById("ulId" + j);
		for (var p = 0; p < sizeship; p++) {
			var li = document.createElement('li');
			li.setAttribute("id", "liId" + j + p);
			var img = document.createElement('img');
			img.src = "images/ok.png";
			li.appendChild(img);
			ul.appendChild(li);
		}
		j++;
		ul.style.left = (1 + j) * 60 + 'px';
		ul.onclick = function() {
			Ship.prototype.clickTable(sizeship, this);
		}
	}
}

Ship.prototype.clickTable = function(sizeship, y) {

	arr.push(sizeship);
	//alert("sizeship=" + arr);
	var k = 0;
	tds = document.getElementsByTagName("td");
	for (var x = 0; x < tds.length / 2; x++) {
		tds[x].onclick = function() {
			var tdId = this.id;
			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			if (sizeship <= (10 - parseInt(stri)) && document.getElementById('td0' + stri + strj).innerHTML == "" && document.getElementById('td0' + (parseInt(stri) + sizeship - 1) + strj).innerHTML == "") {
				//if(document.getElementById('td0' + stri + (parseInt(strj)-1)).innerHTML=="" && document.getElementById('td0' + stri + (parseInt(strj)+1)).innerHTML==""){
				for (var i = parseInt(stri); i < (parseInt(stri) + sizeship); i++) {

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
	for (var x = tds.length / 2; x < tds.length; x++) {
		var ll = 0;
		tds[x].onclick = function() {
			var tdId = this.id;
			var stri = tdId.slice(3, 4);
			var strj = tdId.slice(4, 5);
			if (document.getElementById('td0' + stri + strj).innerHTML != 0) {
				ll++;
				if (document.getElementById('td0' + stri + strj).innerHTML!="" && document.getElementById('td0' + (parseInt(stri)+1) + strj).innerHTML=="") {
					this.state = false;
					alert(this.state);
				}
				document.getElementById('td0' + stri + strj).innerHTML = "<img src='images/error.png' />";
				document.getElementById('td1' + stri + strj).innerHTML = "<img src='images/skeleton.png' />";
			} else {
				document.getElementById('td1' + stri + strj).innerHTML = "<img src='images/fuk.png' />";

			}

		}
	}

}
