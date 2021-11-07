<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Train Details Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="index.css">
    <style>
        .header {
            overflow: hidden;
            background-color: #f1f1f1;
            padding: 20px 10px;
        }

        .header a {
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
        }
        .header input{
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
        }

        .header a.logo {
            font-size: 25px;
            font-weight: bold;
        }

        .header input:hover {
            background-color: #ddd;
            color: black;
        }

        .header input.active {
            background-color: dodgerblue;
            color: white;
        }

        .header-right {
            float: right;
        }
        body{
            background: #FAFAD2;
        }
        input{
            padding: 10px 10px;
            border-radius: 3px;
        }
    </style>
</head>
<body>
<form action="login.jsp">
    <div class="header">
        <a href="#default" class="logo">Indian Railways</a>
        <div class="header-right">
            <input class="active" type="submit" value="Logout">
        </div>
    </div>
</form>
<center>
<b><h1>Welcome</h1>
    <h1 style="text-align: center">Enter the train details below</h1></b><br><br>
<form action="traindb">
    <input type="number" placeholder="Enter the traveling train number" name="trainId">
    <input type="submit" class="btn btn-info" value="Next">
</form>
</center>
</body>
</html>