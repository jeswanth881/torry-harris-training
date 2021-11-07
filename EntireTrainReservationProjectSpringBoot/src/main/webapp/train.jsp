<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Passenger Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css"/>
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
        }
        select{
            padding: 10px 10px;
        }
        option{
            padding: 10px 10px;
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
        <h1 style="text-align: center">Enter the Passenger details</h1></b><br><br>
    <form action="passengerdb">
        <tr><input id="NumberOfPassengers" type = "number" placeholder="number of passengers" required/></tr>

        <div class="col-sm-8">
                <div id="content">
                </div>
        </div>
        <div class="col-sm-4">
            <div class="form-group">
                <br><br><br>
                <input type="number" name="trainId" value="${train.trainId}" readonly>
                <button class="btn btn-primary">Next</button>
            </div>
        </div>
    </form>
</center>
<script  src="https://code.jquery.com/jquery-3.6.0.js"   integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="   crossorigin="anonymous"></script>
<script>
    $('#NumberOfPassengers').on('input',function(e){
        $('#content').html('');
        var val=$(this).val();
        for(let i = 1; i <= val; i++){
            $('#content').append('<div>'+'<br><label for="name">Name:</label>'+
                '<input type="text" name="name'+i+'" id="name" class="trainInput" placeholder="Name" required>'+
                '<label for="age">Age:</label>'+
                '<input type="number" name="age'+i+'" id="age" class="trainInput" placeholder="Age" required>'+
                '<label for="gender" >Gender:&emsp;</label>'+
                '<select name="gender'+i+'" id="gender" required>'+
                '<option value="">select</option>'+
                '<option value="M">Male</option>'+
                '<option value="F">Female</option>'+
                '</select>'+'</div>');
        }

    });

</script>
</body>
</html>