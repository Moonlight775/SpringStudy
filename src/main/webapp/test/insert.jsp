<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<div id='insert'>
	<form name='frm_insert' id='frm_insert' method='post'>
		<label>작성자</label>
		<input type='text' id='mid' value='${vo.mid }'/>
		<br>		
		<label>제목</label>
		<input type='text' id='subject' value='${vo.subject }'/>
		<br>
		<label>내용</label>
		<input type='text' id='doc' value='${vo.doc }'/>
	
		<input type='button' id='btn_insert' value='입력'/>
	
	</form>
	<div id='result'></div>
</div>

<script>
	
		
		$('#btn_insert').on('click',function(){
			var frm = $('#frm_insert')[0];
			var param = $(frm).serialize();
			alert(param)
			$('#result').load('../insert.test', param);
		})


</script>
</body>
</html>