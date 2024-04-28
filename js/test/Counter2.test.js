const createCounter = require("../src/Counter2");

test("case 1", () => {
	const counter = createCounter(5);
	expect(counter.increment()).toStrictEqual(6);
	expect(counter.reset()).toStrictEqual(5);
	expect(counter.decrement()).toStrictEqual(4);
});

test("case 2", () => {
	const counter = createCounter(0);
	expect(counter.increment()).toStrictEqual(1);
	expect(counter.increment()).toStrictEqual(2);
	expect(counter.decrement()).toStrictEqual(1);
	expect(counter.reset()).toStrictEqual(0);
	expect(counter.reset()).toStrictEqual(0);
});