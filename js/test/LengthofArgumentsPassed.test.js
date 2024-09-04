const test = require("node:test");
const assert = require("node:assert/strict");
const argumentsLength = require("../src/LengthofArgumentsPassed");

test("Return Length of Arguments Passed", async (t) => {
	await t.test("One", () => {
		assert.strictEqual(argumentsLength(5), 1);
	});

	await t.test("Three", () => {
		assert.strictEqual(argumentsLength({}, null, "3"), 3);
	});
});