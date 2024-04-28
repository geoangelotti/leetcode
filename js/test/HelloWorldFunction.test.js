const createHelloWorld = require("../src/HelloWorldFunction");

test("case 1", () => {
	const fn = createHelloWorld();
	expect(fn()).toStrictEqual("Hello World");
});

test("case 2", () => {
	const fn = createHelloWorld();
	expect(fn({}, null, 42)).toStrictEqual("Hello World");
});