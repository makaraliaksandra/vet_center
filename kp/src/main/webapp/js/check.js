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

window.onload= function() {
    document.getElementById('toggler').onclick = function() {
        openbox('box', this);
        return false;
    };
};
function openbox(id, toggler) {
    var div = document.getElementById(id);
    if(div.style.display == 'block') {
        div.style.display = 'none';
        toggler.innerHTML = 'Показать диаграмму заявок';
    }
    else {
        div.style.display = 'block';
        toggler.innerHTML = 'Закрыть диаграмму';
    }
}