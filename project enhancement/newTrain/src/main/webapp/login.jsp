<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/cosmo/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="index.css">
    <style type="text/css">
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

        .header a.logo {
            font-size: 25px;
            font-weight: bold;
        }

        .header a:hover {
            background-color: #ddd;
            color: black;
        }

        body,td,th{
            color: #000000;
        }

        body{
            background: #FAFAD2;
        }

        .style2
        {
            font-family: arial;
            font-size: 17px;
            padding: 12px;
            line-height: 25px;
            border-radius: 4px;
            text-decoration: none;

        }
        .g_body{
        height: 100%;
        display: flex;
        align-items: center;
        justify-content: center;
        }

        .g-button{
        border: 1px solid rgb(66, 133, 244);
        background: rgb(66, 133, 244);
        display: flex;
        }

        .g-logo{
        width: 21px;
        height: 21px;
        padding: 8px 10px;
        background: white;
        }

        .g-text{
        font-size: 16px;
        padding: 8px 10px;
        color: white;
        font-family: roboto;
        text-align: center;
        }

    </style>

</head>
<body>
<div class="header">
    <a href="#default" class="logo">Indian Railways</a>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="container">
    <table width="100%" height="100%" border="0" cellpadding="0" align="center">
        <tr>
            <td align="center" valign="middle">
                <table class="table-bordered" width="350" border="0" cellpadding="3"cellspacing="3" bgcolor="#ffffff">

                    <form action="logindb">


                        <tr>
                            <td height="25" colspan="2" align="left" valign="middle" bgcolor="#ffffff" class="style2">
                                <div align="center">
                                    <strong>User Login</strong>
                                </div>

                            </td>
                        </tr>

                        <tr>
                            <td>Username</td>
                            <td>

                                <input type="text" value="${user.email}" class="form-control" readonly/>
                            </td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" value="${user.password}" class="form-control" readonly/></td>
                        </tr>
                        <tr>
                            <td colspan="2"><button type="submit" class="btn btn-info" align="right">Login</button> </td>
                        </tr>
                    </form>
                </table>
            </td>
        </tr>
    </table>
    <center style="padding:30px;">
    <button  class="g-button" id="submit">
    <img class="g-logo" src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/157px-Google_%22G%22_Logo.svg.png" alt="Google Logo">
    <p class="g-text">Sign in with Google</p>
    </button>
    </center>
</div>
<script type="module">

    // Import the functions you need from the SDKs you need

    import { initializeApp } from "https://www.gstatic.com/firebasejs/9.5.0/firebase-app.js";

    import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.5.0/firebase-analytics.js";

    import { getAuth, signInWithPopup, signOut, GoogleAuthProvider } from "https://www.gstatic.com/firebasejs/9.5.0/firebase-auth.js";

    // TODO: Add SDKs for Firebase products that you want to use

    // https://firebase.google.com/docs/web/setup#available-libraries



    // Your web app's Firebase configuration

    // For Firebase JS SDK v7.20.0 and later, measurementId is optional

    const firebaseConfig = {

        apiKey: "AIzaSyA4x-_s6XgInsVZqiV6Bd8QFhAyrwS20TI",

        authDomain: "auth-7a95b.firebaseapp.com",

        projectId: "auth-7a95b",

        storageBucket: "auth-7a95b.appspot.com",

        messagingSenderId: "1088198584127",

        appId: "1:1088198584127:web:8cb2b1d807e2ac7383158a",

        measurementId: "G-3B49EYWLS1"

    };



    // Initialize Firebase

    const app = initializeApp(firebaseConfig);

    const analytics = getAnalytics(app);

    const auth=getAuth(app);

    const provider=new GoogleAuthProvider(app);

    submit.addEventListener('click',(e)=>{

        signInWithPopup(auth, provider).then((result) => {

            // This gives you a Google Access Token. You can use it to access the Google API.

            const credential = GoogleAuthProvider.credentialFromResult(result);

            const token = credential.accessToken;

            // The signed-in user info.

            const user = result.user;

            // ...

            alert("Welcome "+user.displayName+"hii");

            confirm(user.email);

            if(user!=null){

                     window.location.href="index.jsp";


            }

        }).catch((error) => {

            // Handle Errors here.

            const errorCode = error.code;

            const errorMessage = error.message;

            // The email of the user's account used.

            const email = error.email;

            // The AuthCredential type that was used.

            const credential = GoogleAuthProvider.credentialFromError(error);

            // ...

            alert(errorMessage);

        });

    });

</script>
</body>
</html>