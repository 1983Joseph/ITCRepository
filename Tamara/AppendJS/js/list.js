var a=new Array();
var i;
var li;
function addItem(){
    var ul=document.getElementById("ulID");
    var select=document.getElementById("selID");
    if (document.getElementById("inID").value !="" ) {
    li=document.createElement("li");
    var option=document.createElement("option");
    li.appendChild(document.createTextNode(document.getElementById("inID").value));
    option.appendChild(document.createTextNode(document.getElementById("inID").value));
    ul.appendChild(li);
    select.appendChild(option);
    a.push(document.getElementById("inID").value);
    clear();
}
}
function clear(){
    document.getElementById("inID").value="";
}
function addarray(){
    var ol=document.getElementById("olID");
    for (i=0; i<a.length; i++ ){
        li=document.createElement("li");
        li.appendChild(document.createTextNode(a[i]));
        ol.appendChild(li);
    }
}
