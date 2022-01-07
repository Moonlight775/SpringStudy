<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href='../css/tab.css'>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src='../js/tab.js'></script>
</head>
<body>
<div id='hospital'>
	<form name='frm_hospital' id='frm_hospital' method='post'>
		<div id='tab-area' class='tab-area'>
			<div class='inner'>
				<ul class='tabs-nav'>
					<li class='on_tab'><a href='#publichospital'>국민안심병원</a></li>
					<li><a href='#carecenter'>선별진료소</a></li>
					<li><a href='#testing'>코로나검사 실시기관</a></li>
				</ul>
			</div>
			
			<div id='tab-body' class='tab-body'>
				<div id='#publichospital' class='tab-panel'>
					<div class='inner'>
						국민안심병원 내용	
					</div>
				</div>
				
				<div id='#carecenter' class='tab-panel'>
					<div class='inner'>
						선별진료소 내용		
					</div>
				</div>

				<div id='#testing' class='tab-panel'>
					<div class='inner'>
						코로나검사 실시기관 내용		
					</div>
				</div>
			
			</div> 		
		
			<div id='tab-text' class='tab-text'>
				<div id='#publichospital'>
					<h3 class='identify'>내 주변 안심병원 찾기</h3>
				</div>
				
				<div id='#carecenter'>
					<h3 class='identify'>내 주변 선별진료소 찾기</h3>
				</div>
				
				<div id='#testing'>
					<h3 class='identify'>내 주변 코로나검사 기관 찾기</h3>
				</div>
			
			
			</div>
	
	
	
		</div>	
	</form>

</div>
</body>
</html>