<%@ page  language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import="java.sql.SQLException" %> 
  <%@ page import="java.util.ArrayList" %> 
  <%@ page import="javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, 
   javax.servlet.http.HttpServletResponse" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Luxe &mdash; 100% Free Fully Responsive HTML5 Template by
	FREEHTML5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<meta name="author" content="FREEHTML5.CO" />

<!-- 
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE 
	DESIGNED & DEVELOPED by FREEHTML5.CO
		
	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	 -->

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<link rel="shortcut icon" href="favicon.ico">
<!-- <link href='https://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700italic,900,700,900italic' rel='stylesheet' type='text/css'> -->

<!-- Stylesheets -->
<!-- Dropdown Menu -->
<link rel="stylesheet" href="css/superfish.css">
<!-- Owl Slider -->
<!-- <link rel="stylesheet" href="css/owl.carousel.css"> -->
<!-- <link rel="stylesheet" href="css/owl.theme.default.min.css"> -->
<!-- Date Picker -->
<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
<!-- CS Select -->
<link rel="stylesheet" href="css/cs-select.css">
<link rel="stylesheet" href="css/cs-skin-border.css">

<!-- Themify Icons -->
<link rel="stylesheet" href="css/themify-icons.css">
<!-- Flat Icon -->
<link rel="stylesheet" href="css/flaticon.css">
<!-- Icomoon -->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Flexslider  -->
<link rel="stylesheet" href="css/flexslider.css">

<!-- Style -->
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<div id="fh5co-wrapper">
		<div id="fh5co-page">
			<div id="fh5co-header">
				<header id="fh5co-header-section">
					<div class="container">
						<div class="nav-header">
							<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
							<h1 id="fh5co-logo">
								<a href="index.html">Apartments Radovic</a>
							</h1>
							<nav id="fh5co-menu-wrap" role="navigation">
								<ul class="sf-menu" id="fh5co-primary-menu">
									<li><a href="index.html">Home</a></li>
									<li><a class="active" href="hotel.html"
										class="fh5co-sub-ddown">Apartments</a>
										<ul class="fh5co-sub-menu">
											<li><a href="#">Apartment 4+0</a></li>
											<li><a href="#">Apartment Studio 2+0</a></li>
										</ul></li>

									<li><a href="guestmanagement.html">Guest management</a></li>
									<li><a href="contact.html">Contact</a></li>
								</ul>
							</nav>
						</div>
					</div>
				</header>

			</div>
			<!-- end:fh5co-header -->
			<div class="fh5co-parallax"
				style="background-image: url(images/slider1.jpg);"
				data-stellar-background-ratio="0.5">
				<div class="overlay"></div>
				<div class="container">
					<div class="row">
						<div
							class="col-md-12 col-md-offset-0 col-sm-12 col-sm-offset-0 col-xs-12 col-xs-offset-0 text-center fh5co-table">
							<div class="fh5co-intro fh5co-table-cell">
								<h1 class="text-center">We Offer Services</h1>
								<p>
									Made with love by the fine folks at <a
										href="http://freehtml5.co">FreeHTML5.co</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
									
			<div class="container">
				<div class="row">
					<div class="col-md-12" style="background-color: #FF5722;">
						<p style="color: black;">List of available dates:</p>
						<table class="table" id="tablica">
							<thead>
								<tr>
									<th>Studio<span style="padding-left: 60px;"> <span
											class="glyphicon glyphicon-user"></span><span
											class="glyphicon glyphicon-user"></span></span></th>
									<th>Apartment 4+0<span style="padding-left: 60px;""><span
											class="glyphicon glyphicon-user"></span><span
											class="glyphicon glyphicon-user"></span><span
											class="glyphicon glyphicon-user"></span><span
											class="glyphicon glyphicon-user"></span></span></th>

								</tr>
									
							</thead>
							
							<tbody>
							
							
							
							
							</tbody>



						</table>
					</div>
				</div>
			</div>

			<footer id="footer" class="fh5co-bg-color">
				<div class="container">
					<div class="row">
						<div class="col-md-4">
							<div class="copyright">
								<p>
									<small>&copy; 2016 Free HTML5 Template. <br> All
										Rights Reserved. <br> Designed by <a
										href="http://freehtml5.co" target="_blank">FreeHTML5.co</a> <br>
										Demo Images: <a href="http://unsplash.com/" target="_blank">Unsplash</a></small>
								</p>
							</div>
						</div>
						<div class="col-md-8">
							<div class="row">
								<div class="col-md-6">
									<h3>Company</h3>
									<ul class="link">
										<li><a href="#">About us</a></li>
										<li><a href="#">Apartments</a></li>
										<li><a href="#">Guest management page</a></li>
										<li><a href="#">Contact Us</a></li>
									</ul>
								</div>


								<div class="col-md-6">
									<ul class="social-icons">
										<li><a href="#"><i class="icon-twitter-with-circle"></i></a>
											<a href="#"><i class="icon-facebook-with-circle"></i></a> <a
											href="#"><i class="icon-instagram-with-circle"></i></a> <a
											href="#"><i class="icon-linkedin-with-circle"></i></a></li>
									</ul>
								</div>
							</div>
						</div>
			</footer>

		</div>
		<!-- END fh5co-page -->

	</div>
	<!-- END fh5co-wrapper -->

	<!-- Javascripts -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- Dropdown Menu -->
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Counters -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Owl Slider -->
	<!-- // <script src="js/owl.carousel.min.js"></script> -->
	<!-- Date Picker -->
	<script src="js/bootstrap-datepicker.min.js"></script>
	<!-- CS Select -->
	<script src="js/classie.js"></script>
	<script src="js/selectFx.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>

	<script src="js/custom.js"></script>
<script>


$(document).ready(function(){
	
$.ajax({
	url: 'http://localhost:8080/com.dajance/src/com/dajance/Dostupnost.java',
	dataType: "json",
	method: "GET",
	success: function (data){

		var employeeTable = $('#tablica tbody');
		$(data).each(function(index, json){
			employeeTable.append('<tr><td>' + json + '</td><td>' 
				+ 'prazno' + '</td></tr>');

		});

		//$('#txtName').val(Data.Name);
		//$('txtGender').val(Data.Gender);
		//$('txtSalary').val(Data.Salary);

	},

	error: function (err){

		alert(err);
	}



});

});



</script>
	
</body>
</html>