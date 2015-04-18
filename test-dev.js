
var core = require('./index-dev');

console.log(core);

console.log(core.fun());

console.log(core.render("template {{view}}", {view: "rendered!"}));

//Test source map support
core.ex();
