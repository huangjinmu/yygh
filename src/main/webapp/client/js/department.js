var dataStr = '内科:\
心血管内科,神经内科,消化内科,内分泌科,免疫科,呼吸科,肾病内科,血液科,感染内科,过敏反应科,老年病科,普通内科,高压氧科\
=外科:\
神经外科,功能神经外科,心血管外科,胸外科,整形科,乳腺外科,泌尿外科,肝胆外科,肛肠科,血管外科,器官移植,微创外科,普外科,脑外科,烧伤科\
=妇产科:\
妇科,产科,妇科内分泌,妇泌尿科,遗传咨询科,计划生育科,妇产科\
=生殖中心:\
生殖中心\
=儿科:\
儿科,新生儿科,小儿呼吸科,小儿营养保健科,小儿心内科,小儿皮肤科,小儿精神科,小儿外科,小儿心外科,小儿骨科,小儿神经外科,小儿康复科\
=骨外科:\
骨科,脊柱外科,手外科,创伤骨科,骨关节科,矫形骨科,骨质疏松科,骨伤专科\
=眼科:\
眼科,小儿眼科,眼底,角膜科,青光眼,白内障,眼外伤,眼眶及肿瘤,屈光,眼整形\
中医眼科\
=口腔科:\
口腔科,颌面外科,正畸科,牙体牙髓科,牙周科,口腔粘膜科,儿童口腔科,口腔修复科,种植科,口腔预防科,口腔特诊科,口腔急诊科\
=耳鼻咽喉头颈科:\
耳鼻喉,头颈外科\
=肿瘤科:\
肿瘤内科,肿瘤外科,肿瘤妇科,放疗科,骨肿瘤科,肿瘤康复科,肿瘤综合科\
=皮肤性病科:\
皮肤科,性病科\
=男性学科:\
男性学科\
=皮肤美容:\
皮肤美容\
=烧伤科:\
烧伤科\
=精神心理科:\
精神科,心理咨询科,司法鉴定科,双相障碍科,药物依赖科\
=中医科:\
中医妇产科,中医儿科,中医骨科,中医皮肤科,中医内分泌,中医消化科,中医呼吸科,中医肾病内科,中医免疫内科,中医心内科,中医神经内科,中医肿瘤科,中医血液科,中医肝病科,中医五官科,中医男科,针灸科,中医按摩科,中医外科,中医乳腺外科,中医肛肠科,中医老年病科,中医科,中医内科,中医脾胃科,膏方门诊,中医骨伤科\
=中西医结合科:\
中西医结合科\
=传染病科:\
肝病科,传染科\
=结核病科:\
结核病科\
=介入医学科:\
介入医学科\
=康复医学科:\
康复科,理疗科\
=运动医学科:\
运动医学科\
=麻醉医学科:\
疼痛科,麻醉科:\
=职业病科:\
职业病科\
=地方病科:\
地方病科\
=营养科:\
营养科\
=医学影像学:\
核医学科,放射科,超声科,医学影像科\
=病理科:\
病理科\
=其他科室:\
急诊科,特色医疗科,干部诊疗科,重症监护室,特诊科,检验科,预防保健科,功能检查科,全科,体检科,血透中心,实验中心,碎石中心,变态反应科';


$(function () {






	$('.hot .expand').on('click',function(){
		if( $('.hot').hasClass('hot_height_auto') ){
			$('.hot').removeClass('hot_height_auto')
			$(this).text('展开全部');
		}else{
			$(this).text('收缩全部');
			$('.hot').addClass('hot_height_auto')

		}
	});

/*function initKsxx(data){

	if(data!=null&&data!=""&&data!=undefined){
		for(var  i=0;i<data.length;i++) {

		}
	}


}
//	分析数据
	var  data = dataStr.split('=');

	var finalData = [];

	for(i=0;i<data.length;i++){
		var _d = data[i].split(':');
		var caption = _d[0];
		var list = _d[1].split(',');
		finalData.push( {caption:caption,list:list} );
	}

	$('.side').empty();
	$('.content').empty();

	for(i=0;i<finalData.length;i++){

		var caption = finalData[i].caption;
		var list = finalData[i].list;

		//	输出侧边热门科室
		$('.side').append('<a href="#d_'+i+'" class="item"><i style="background-position:0 -'+i*22+'px" class="icon"></i>'+caption+'</a>')

		//	输出列表内容
		var html = ['<div class="group"><div class="caption"><a name="#d_'+i+'"></a>'+caption+'</div><div class="list">']
		for(j=0;j<list.length;j++){
				html .push('<a href="#1" class="item">'+list[j]+'</a>');
		}
		html .push('</div></div>');

		$('.content').append(html.join(''));
	}
	console.log(finalData);*/

	$(".side > .item").on("click",function () {
		var index=$(this).index();
		alert(index);
		scrollToLocation(index);
	})


});
function scrollToLocation(index) {
	var mainContainer = $(window);
	var scrollToContainer = $(".content > .group").eq(index);//滚动到<div id="thisMainPanel">中类名为son-panel的最后一个div处
	//scrollToContainer = mainContainer.find('.son-panel:eq(5)');//滚动到<div id="thisMainPanel">中类名为son-panel的第六个处
	//非动画效果
	var main_top=$(".main").offset().top;
	var g_top = scrollToContainer.offset().top;
	var w_top = getScrollTop();
	mainContainer.scrollTop(
		scrollToContainer.offset().top-main_top
	);
};
function getScrollTop() {
	var scrollPos;
	if (window.pageYOffset) {
		scrollPos = window.pageYOffset; }
	else if (document.compatMode && document.compatMode != 'BackCompat')
	{ scrollPos = document.documentElement.scrollTop; }
	else if (document.body) { scrollPos = document.body.scrollTop; }
	return scrollPos;
};
