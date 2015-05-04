module.exports = function(core) {

    console.log(core.fun());

    console.log(core.render("template {{view}}", {view: "rendered!"}));

    //Test source map support
    try {
        core.ex();
    } catch (e) {
        console.error('Exception thrown:', e.message);
        console.error('    stack trace show cljs loc (dev only)', e.stack.split('\n')[1]);
    }
}
