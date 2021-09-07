// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
});

async function cargarUsuarios(){
    const requets = await fetch('usuario/1', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
    });
    const usuarios = await requets.json();
    console.log(usuarios);
}
