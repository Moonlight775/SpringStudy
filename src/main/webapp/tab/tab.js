/**
 * 
 */

/*$(function(){
	$('#tab-area').tabs();
});*/

$(document).ready(function(){
	$(".tab-nav li").click(function(){
		var idx = $(this).index();
		$(".tab-nav li").removeClass("on_tab");
		$(".tab-nav li").eq(idx).addClass("on_tab");
		$("#tab-body > div").hide();
		$("#tab-body > div").eq(idx).show();
		$(".tab_text > div").hide();
		$(".tab_text > div").eq(idx).show();
		
	})
});