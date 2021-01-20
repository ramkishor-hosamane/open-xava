<%
String app = request.getParameter("application");
%>
<div id="sign_in_box">
	<jsp:include page='<%="../xava/module.jsp?application=" + app + "&module=SignIn"%>'/>
<h1>I got it.This is Signin page</h1>
<button onclick="micky_mouse();">Micky Mouse</button>
</div>

<script>
function micky_mouse(){
	alert("Akanksha");
}
</script>