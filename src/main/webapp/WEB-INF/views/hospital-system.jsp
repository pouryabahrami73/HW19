<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11/22/2020
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="fa" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>سامانه بیمارستان</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.rtlcss.com/bootstrap/v4.2.1/css/bootstrap.min.css"
          integrity="sha384-vus3nQHTD+5mpDiZ4rkEPlnkcyTP+49BhJ4wJeJunw06ZAp+wzzeBPUXr42fi8If" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/firstCss.css">
    <!--<script src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    <script src="dynamicSelection.js"></script>-->
</head>
<body>
<form class="d-flex justify-content-center align-self-center flex-wrap bd-highlight mb-3 height320px">
    <div class="card p-2 bd-highlight align-self-center height160px" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">
                <center>سامانه بیمارستان</center>
            </h5>
            <button type="submit" formaction="drug" class="btn btn-outline-success btn-block">ثبت دارو</button>
            <button type="submit" formaction="patient.html" class="btn btn-outline-warning btn-block">ثبت بیمار</button>
        </div>
    </div>
</form>

</body>
</html>
