import test from "node:test";
import { strict as assert } from "node:assert";
import evalRPN from "../src/EvaluateReversePolishNotation.mjs";

test("Evaluate Reverse Polish Notation", async (t) => {
	await t.test("1st", () => {
		assert.strictEqual(evalRPN(["2", "1", "+", "3", "*"]), 9);
	});

	await t.test("2nd", () => {
		assert.strictEqual(evalRPN(["4", "13", "5", "/", "+"]), 6);
	});
});