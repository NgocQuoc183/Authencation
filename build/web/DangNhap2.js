document.addEventListener('DOMContentLoaded', function() {
    const showRegister = document.getElementById('showRegister');
    const showLogin = document.getElementById('showLogin');
    const container = document.getElementById('container');

    showRegister.addEventListener('click', () => {
        container.classList.add('right-panel-active');
    });

    showLogin.addEventListener('click', () => {
        container.classList.remove('right-panel-active');
    });
});
