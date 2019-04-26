function check() {
	var nickname = document.getElementById("u17_input").value;
	var pwd = document.getElementById("u7_input").value;
	var pwd2 = document.getElementById("u12_input").value;
	if(nickname=="昵称") 
		{
		alert("昵称不能为空！！");
		return false;
		}
	var reg = new RegExp("[\\u4E00-\\u9FFF]+");
	if(reg.test(nickname)){
	alert("包含汉字！");return false;
	}
	/*else{
	//alert('不包含汉字')
	} */	
	else if(pwd=="密码") {
		alert("密码不能为空！！");return false;
	}
	else if(pwd2=="确认密码"){
		alert("确认密码不能为空！！");return false;
	}
	else if(pwd!=pwd2){
		alert("两次密码不同！！");return false;
	}
	//event.stopPropagation();
	//return false;	
	return true;
}