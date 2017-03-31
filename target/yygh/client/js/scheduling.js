var week = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];

$(function () {

	$('#schedule_box_wrap').empty();

	//	输出今天之后10个星期的排班

	var pageCount = 7;
	
	var currentPage = 0;

	var days = pageCount*7;
	
	var date = new Date();
	var time = date.getTime();


	for(i=0;i<days;i++){

		var _t =  time +  i* 86400 * 1000; //	1天的毫秒数;
		var _d = new Date(_t);

		var html = [];

		var w = week[_d.getDay()];
		var y = _d.getFullYear();
		var m = _d.getMonth() + 1;
		m = m < 10 ? '0'+m : m;
		var d = _d.getDate();
		d = d < 10 ? '0'+d : d;

		html.push('<div class="schedule_box_item"> <div class="date">'+w+'<br>'+y+'-'+m+'-'+d+'</div>');

		html.push('<div class="status"></div>');	//	上午	输出前应该向后抬服务器进行检查
		html.push('<div class="status"></div>');	//	下午
		html.push('<div class="status"></div></div>');	//	晚上

		$('#schedule_box_wrap').append(html.join(''));

	}

	//	按钮处理
	var width = $('.schedule_box').width();
	
	$('#schedule_box_wrap').on('flashLeft',function(){
		$(this).css('left',width*currentPage*-1);
	});

	$('.schedule_tool_left .icon').on('click',function(){
			if(currentPage-1>=0){
				currentPage-=1;
				$('#schedule_box_wrap').triggerHandler('flashLeft');
			}
			return false;

	})
	$('.schedule_tool_right .icon').on('click',function(){
			if(currentPage+1 < pageCount){
				currentPage+=1;
				$('#schedule_box_wrap').triggerHandler('flashLeft');
			}
			return false;
	})
})