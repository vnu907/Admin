<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Muli' rel='stylesheet'>
    <style>
        * {
            box-sizing: border-box
        }

        body {
            font-family: 'Muli';
            background-color: #084c55;
            color: white;
        }

        .access-denied {
            text-align: center;
            margin-top: 15%;
        }

        .title {
            font-size: 2.3em;
            color: #FF5733;
        }
        .subtitle {
            margin-bottom: 50px;
        }

        .buttons {
            margin-top: 6%;
        }

        .button {
            background-color: aqua;
            padding: 20px;
        }
        a{
            text-decoration: none;
        }

        /* Style the tab */
    </style>
</head>

<body>
    <div class="access-denied">
        <div class="title" data-content="404">
            403 - ACCESS DENIED
        </div>

        <div class="subtitle">
            Oops, You don't have permission to access this page.
        </div>
        <div >
            <img src="https://img.icons8.com/fluency/96/000000/restriction-shield.png"/>
        </div>
        <div class="buttons">
            <a class="button" href="/">Go to homepage</a>
        </div>
    </div>


</body>

</html>