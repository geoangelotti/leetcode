const { expect, test } = require("@jest/globals");
const fibGenerator = require("../src/FibonacciGenerator");

test("case 1", () => {
	const gen = fibGenerator();
	expect(gen.next().value).toStrictEqual(0);
	expect(gen.next().value).toStrictEqual(1);
	expect(gen.next().value).toStrictEqual(1);
	expect(gen.next().value).toStrictEqual(2);
	expect(gen.next().value).toStrictEqual(3);
});