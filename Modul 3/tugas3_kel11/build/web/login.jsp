
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<body background="gambar2.jpg">
</body>
</html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login Data</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/bootstrap.min.js"></script> 
    <style>
      .menu {
        margin-left: -15px; 
        margin-right: 15px;
      }
      .daftar{
        border: 2px solid #e5e5e5; 
        border-radius: 10px; 
        padding: 20px;
      }
      .daftar a{
        margin-top: 2%;
      }
      .detail{
        padding: 10px 0px;
      }
      .nav{
        padding: 0px; 
        border: 1px solid #e5e5e5;
        border-radius: 5px;
      }
      .nav li{
        border-bottom: 1px solid #e5e5e5;
        border-radius: 5px;
      }

    </style>
</head>

<body>
    <div class="container">
        <div class="jumbotron row">
          <center><h2><b>DATA MAHASISWA UNDIP</b></h2>
          <h4>TUGAS RSBK - KELOMPOK11</h4></center>
        </div>
        <div class="row content">
          <div class="col-md-12">
            <div class="col-md-4 col-md-offset-4 daftar">
              <p class="form-title">Sign In</p>
              <form method="POST" action="/tugas3_kel11/LoginServlet" class="login">
                <div class="form-group">
                  <label>Identitas</label>
                  <input type="text" class="form-control" placeholder="Username" name="userName" type="text" autofocus />
                </div>
                <div class="form-group">
                  <label>Password</label>
                  <input type="password" class="form-control" placeholder="Password" name="password" value="" required />
                </div>
                <input type="submit" name="login" value="Login" class="btn btn-md btn-success" />
              </form>
            </div>
          </div>
        </div>
    </div>
</body>
</html>
