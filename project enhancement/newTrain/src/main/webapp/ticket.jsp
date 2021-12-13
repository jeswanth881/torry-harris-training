<!DOCTYPE html>
<html oncontextmenu="return false" onkeydown="return false" onmousedown="return false">

<head>
    <title>Ticket Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="index.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js"></script>
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
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
            margin: 0px auto;
        }
        #htmlContent{

        }
        td, th, button {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        button {
            border: 1px solid black;
        }
        tr:nth-child(even) {
            background-color: #dddddd;
        }
        .ticket {
            position: relative;
            box-sizing: border-box;
            width: 850px;
            height: 850px;
            margin: 150px auto 0;
            padding: 20px;
            border-radius: 10px;
            background: #FBFBFB;
            box-shadow: 2px 2px 15px 0px #AB9B0D;
        }
        .ticket__content {
            box-sizing: border-box;
            height: 100%;
            width: 100%;
            border: 6px solid #D8D8D8;
        }
    </style>
       <link rel="stylesheet" href=

    "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

       <script async

      src="https://pay.google.com/gp/p/js/pay.js"

      onload="onGooglePayLoaded()"></script>
</head>
<body style="background : #FAFAD2">
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
        <h1 style="text-align: center">Download Ticket Below</h1></b><br><br>
        <input type="text" id="name" value="jeswanth" readonly>
        <input type="number" id="age" value="21" readonly>
        <input type="text" id="gender" value="Male" readonly>
        <input type="text" name="qty" id="retail" value="${train.ticketPrize}" readonly><br><br>
<%--        <button type="submit" class="btn btn-info" onclick="fun()">Calculate passenger fair</button><br><br><br>--%>
        <input type="text" id="name1" value="bharath" readonly>
        <input type="number" id="age1" value="11" readonly>
        <input type="text" id="gender1" value="Male" readonly>
        <input type="text" id="retail1" name="qty" value="${train.ticketPrize}" readonly><br><br>
<%--        <button type="submit" class="btn btn-info" onclick="fun()">Calculate passenger fair</button><br><br><br>--%>
        <input type="text" id="name2" value="krishna" readonly>
        <input type="number" id="age2" value="65" readonly>
        <input type="text" id="gender2" value="Male" readonly>
        <input type="text" id="retail2" name="qty" value="${train.ticketPrize}" readonly><br><br>
<%--        <button type="submit" class="btn btn-info" onclick="fun()">Calculate passenger fair</button><br><br><br>--%>
        <input type="text" id="name3" value="anjana" readonly>
        <input type="number" id="age3" value="30" readonly>
        <input type="text" id="gender3" value="Female" readonly>
        <input type="text" id="retail3" name="qty" value="${train.ticketPrize}" readonly><br><br>
        <h3>Total Ticket Price: </h3><input type="number" id="retail4" readonly><br><br>
        <h3>Select the travel date: </h3><input type="date" required placeholder="Select the date travel" id="mydate" min="2021-12-10"><br>
        <button type="submit" class="btn btn-info" onclick="fun();add();sub();">Calculate passenger fair</button>
</center>
<script src="passenger.js">
</script>
</body>
<body>
<div id="htmlContent">
    <div class="ticket">
        <div class="ticket__content">
            <center>
                <br>
                <br>
            <h5><b>PNR No:</b><p id="sd"></p></h5>
            <h5><b>Train Number:</b> ${train.trainId}</h5><br>
            <h5><b>Train Name:</b> ${train.trainName}</h5><br>
            <h5><b>Source Point:</b> <p id="source">${train.sourcePoint}</p></h5>
            <h5><b>Destination point:</b><p id="destination">${train.destinationPoint}</p></h5>
            <h5><b>Travel Date:</b><p id="date"></p></h5>
            </center>
            <table>
            <tr>
                <td>Name</td>
                <td>Age</td>
                <td>Gender</td>
                <td>Fare</td>
            </tr>
                <tr>
                    <td><p id="a"></p></td>
                    <td><p id="b"></p></td>
                    <td><p id="c"></p></td>
                    <td><p id="d"></p></td>
                </tr>
                <tr>
                    <td><p id="e"></p></td>
                    <td><p id="f"></p></td>
                    <td><p id="g"></p></td>
                    <td><p id="h"></p></td>
                </tr>
                <tr>
                    <td><p id="i"></p></td>
                    <td><p id="j"></p></td>
                    <td><p id="k"></p></td>
                    <td><p id="l"></p></td>
                </tr>
                <tr>
                    <td><p id="m"></p></td>
                    <td><p id="n"></p></td>
                    <td><p id="o"></p></td>
                    <td><p id="p"></p></td>
                </tr>
            </table><br>
            <center>
            <h5><b>Total Price:</b><p id="retail5"></p> </h5>
            </center>
        </div>
    </div>
</div><br><br>
<div id="editor"></div>
<center>
    <form>

        <div id="container" style="padding:10px;">

            <br><br><br>

            </form>

    </div>

        <div id="message" style="margin:60px"></div>
</center>
<script src="ticket.js">
</script>
<script src="demo1.js">
</script>
<script src="demo.js">
</script>

</body>
 <script type="text/javascript">

        const baseRequest = {

          apiVersion: 2,

          apiVersionMinor: 0

        };



        const allowedCardNetworks = ["AMEX", "DISCOVER", "INTERAC", "JCB", "MASTERCARD", "VISA"];



        const allowedCardAuthMethods = ["PAN_ONLY", "CRYPTOGRAM_3DS"];



        const tokenizationSpecification = {

          type: 'PAYMENT_GATEWAY',

          parameters: {

            'gateway': 'example',

            'gatewayMerchantId': 'exampleGatewayMerchantId'

          }

        };



        const baseCardPaymentMethod = {

          type: 'CARD',

          parameters: {

            allowedAuthMethods: allowedCardAuthMethods,

            allowedCardNetworks: allowedCardNetworks

          }

        };

        const cardPaymentMethod = Object.assign(

          {},

          baseCardPaymentMethod,

          {

            tokenizationSpecification: tokenizationSpecification

          }

        );



        let paymentsClient = null;



        function getGoogleIsReadyToPayRequest() {

          return Object.assign(

              {},

              baseRequest,

              {

                allowedPaymentMethods: [baseCardPaymentMethod]

              }

          );

        }

        function getGooglePaymentDataRequest() {

          const paymentDataRequest = Object.assign({}, baseRequest);

          paymentDataRequest.allowedPaymentMethods = [cardPaymentMethod];

          paymentDataRequest.transactionInfo = getGoogleTransactionInfo();

          paymentDataRequest.merchantInfo = {

             merchantName: 'Example Merchant'

          };

          return paymentDataRequest;

        }





        function getGooglePaymentsClient() {

          if ( paymentsClient === null ) {

            paymentsClient = new google.payments.api.PaymentsClient({environment: 'TEST'});

          }

          return paymentsClient;

        }

        function onGooglePayLoaded() {

          const paymentsClient = getGooglePaymentsClient();

          paymentsClient.isReadyToPay(getGoogleIsReadyToPayRequest())

              .then(function(response) {

                if (response.result) {

                  addGooglePayButton();

                  }

              })

              .catch(function(err) {

                  console.error(err);

              });

        }





        function addGooglePayButton() {

          const paymentsClient = getGooglePaymentsClient();

          const button =

              paymentsClient.createButton({onClick: onGooglePaymentButtonClicked});

          document.getElementById('container').appendChild(button);

        }



        function getGoogleTransactionInfo() {

          return {

            countryCode: 'US',

            currencyCode: 'USD',

            totalPriceStatus: 'FINAL',



            totalPrice: '1.00'

          };

        }



        function prefetchGooglePaymentData() {

          const paymentDataRequest = getGooglePaymentDataRequest();

          paymentDataRequest.transactionInfo = {

            totalPriceStatus: 'NOT_CURRENTLY_KNOWN',

            currencyCode: 'USD'

          };

          const paymentsClient = getGooglePaymentsClient();

          paymentsClient.prefetchPaymentData(paymentDataRequest);

        }



        function onGooglePaymentButtonClicked() {

          const paymentDataRequest = getGooglePaymentDataRequest();

          paymentDataRequest.transactionInfo = getGoogleTransactionInfo();



          const paymentsClient = getGooglePaymentsClient();

          paymentsClient.loadPaymentData(paymentDataRequest)

              .then(function(paymentData) {

                // handle the response

                processPayment(paymentData);

              })

              .catch(function(err) {

                // show error in developer console for debugging

                console.error(err);

              });

        }



        function processPayment(paymentData) {

             console.log(paymentData);

            paymentToken = paymentData.paymentMethodData.tokenizationData.token;

        }

    </script>
</html>