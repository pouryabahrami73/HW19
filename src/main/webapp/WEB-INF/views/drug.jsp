<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11/22/2020
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="fa" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ثبت دارو</title>
    <link rel="stylesheet" href="https://cdn.rtlcss.com/bootstrap/v4.2.1/css/bootstrap.min.css"
          integrity="sha384-vus3nQHTD+5mpDiZ4rkEPlnkcyTP+49BhJ4wJeJunw06ZAp+wzzeBPUXr42fi8If" crossorigin="anonymous">
    <link rel="stylesheet" href="css/firstCss.css">
</head>
<body>
<form id="drug" class="d-flex justify-content-center align-self-center flex-wrap bd-highlight mb-3"
      action="/save" method="POST">
    <div class="card p-2 bd-highlight align-self-center" style="width: 50rem;">
        <div class="form-group row">
            <label for="inputEmail3" class="col-sm-2 col-form-label">نام دارو<sup class="star">*</sup></label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inputEmail3" name="name">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputPassword4" class="col-sm-2 col-form-label">کد دارو<sup class="star">*</sup></label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inputPassword4" name="code">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputPassword3" class="col-sm-2 col-form-label">قیمت<sup class="star">*</sup></label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="inputPassword3" name="price">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputPassword5" class="col-sm-2 col-form-label">توضیحات</label>
            <div class="col-sm-10">
                <input type="text" class="form-control height160px" id="inputPassword5" name="information">
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-primary">تایید</button>
                <button type="submit" formaction="google.com" class="btn btn-danger">لغو</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
