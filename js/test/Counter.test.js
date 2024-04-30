const { expect, test } = require("@jest/globals");
const createCounter = require("../src/Counter");

test("case 1", () => {
	const counter = createCounter(10);
	expect(counter()).toStrictEqual(10);
	expect(counter()).toStrictEqual(11);
	expect(counter()).toStrictEqual(12);
});

test("case 2", () => {
	const counter = createCounter(-2);
	expect(counter()).toStrictEqual(-2);
	expect(counter()).toStrictEqual(-1);
	expect(counter()).toStrictEqual(0);
	expect(counter()).toStrictEqual(1);
	expect(counter()).toStrictEqual(2);
});