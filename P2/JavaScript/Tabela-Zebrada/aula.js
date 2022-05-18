
var linhas = document.getElementsByTagName("tr");

for(var i = 0 ; i < linhas.length ; i++) {

    if (i % 2 == 0)    
    linhas[i].setAttribute("class" , "cor1");
    else
        linhas[i].setAttribute("class" , "cor2");
}

