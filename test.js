core = require('./index');

console.log(core);

console.log(core);

console.log(core.fun());

console.log(core.render("template {{view}}", {view: "rendered!"}));

core.ex();
