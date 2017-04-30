function submitUserForm() {

    // getting the employee form values
    var login = $('#login').val().trim();
    var password = $('#password').val();
    var id_role = $('#id_role').val();
    if(login.length ==0) {
        alert('Please enter login');
        $('#login').focus();
        return false;
    }
    return true;
};