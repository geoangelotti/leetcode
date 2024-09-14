import test from "node:test";
import { strict as assert } from "node:assert";
import argumentsLength from "../src/LengthofArgumentsPassed.mjs";

test("Return Length of Arguments Passed", async (t) => {
	await t.test("One", () => {
		assert.strictEqual(argumentsLength(5), 1);
	});

	await t.test("Three", () => {
		assert.strictEqual(argumentsLength({}, null, "3"), 3);
	});
});