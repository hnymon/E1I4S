
/* 회원가입 - 입력 정보 확인 */
function checkJoin(){
	if(document.joinForm.id.value == ""){
		alert("아이디을 입력하세요~");
		document.joinForm.id.focus();
	} 
	else if(document.joinForm.password.value == ""){
		alert("비밀번호를 입력하세요~");
		document.joinForm.password.focus();
	}
	else if(document.joinForm.password.value != document.joinForm.repassword.value){
		alert("비밀번호가 틀려요~");
		document.joinForm.repassword.focus();
	}
	else if(document.joinForm.name.value == ""){
		alert("이름을 입력하세요~");
		document.joinForm.name.focus();
	}
	else if(document.joinForm.nickName.value == ""){
		alert("닉네임을 입력하세요~");
		document.joinForm.name.focus();
	}
	else if(document.joinForm.phoneNumber.value == ""){
		alert("전화번호를 입력하세요~");
		document.joinForm.phoneNumber.focus();
	}
	else if(document.joinForm.birth.value == ""){
		alert("생년월일을 입력하세요~");
		document.joinForm.birth.focus();
	}
	else if(document.joinForm.email.value == ""){
		alert("이메일을 입력하세요~");
		document.joinForm.email.focus();
	}
	else if(document.joinForm.domain.value == ""){
		alert("도메인을 입력하세요~");
		document.joinForm.domain.focus();
	}
	else if(document.joinForm.addr.value == ""){
		alert("주소를 입력하세요~");
		document.joinForm.addr.focus();
	}
	else {
		document.joinForm.submit();
	}
}




