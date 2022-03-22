<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">


<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">


  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">


  <!-- Template Main CSS File -->
  <link type="text/css" href="/yourtoday/resources/css/style.css" rel="stylesheet">


</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="container-fluid d-flex justify-content-between align-items-center">

      <div class="logo">
        <h1 class="text-light"><a href="index.html"><span></span></a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
      </div>
      <div class="contact-link float-right">
        <a href="#contact" class="scrollto"></a>
      </div>
    </div>
  </header><!-- End #header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero">
    <div class="hero-container">

      <!-- <div class="countdown" data-count="2023/12/3" data-template="%d days %h:%m:%s"></div> -->
	
      <form action="forms/notify.php" method="post" role="form" class="php-email-form">
        <div class="row no-gutters">
     
        </div>
        <div class="my-3">
          <div class="loading">Loading</div>
          <div class="error-message"></div>
          <div class="sent-message">Your notification request was sent. Thank you!</div>
        </div>
        <!-- <div class="text-center"><button type="submit"></button></div> -->
      </form>
    </div>
  </section><!-- End Hero -->

  <main id="main">


  </main>

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>SSo</span></strong>. All Rights Reserved
      </div>
      <div class="credits">
        Designed by ssoMade</a>
      </div>
    </div>
  </footer><!-- End #footer -->


</body>

</html>

