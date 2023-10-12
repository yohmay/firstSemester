function loadXMLDoc() {
  if (window.XMLHttpRequest) {
    xmlhttp = new XMLHttpRequest();
  } else {
    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange = function () {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
    }
  };

  xmlhttp.open("GET", url, true);
  xmlhttp.send();
}

$.ajax({
  url: "info.php",
  type: "post",
  data: {
    student: "Prof. Gobbato",
    email: "professorgobbato@yahoo.com.br",
  },
  dataType: "html",
  username: "teacher",
  password: "123456",
  beforeSend: function () {
    $("#loading").fadeln();
  },
  timeout: 3000,
  success: function (sucess) {
    $("#response").html(sucess);
  },
  error: function (erro) {
    $("#response").html(erro);
  },
});
