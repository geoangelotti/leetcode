import test from "node:test";
import { strict as assert } from "node:assert";
import isCircularSentence from "../src/CircularSentence.mjs";

test("Return true if it is circular", async (t) => {
  await t.test("case 1", () => {
    assert.strictEqual(
      isCircularSentence("leetcode exercises sound delightful"),
      true
    );
  });
  await t.test("case 2", () => {
    assert.strictEqual(isCircularSentence("eetcode"), true);
  });
  await t.test("case 3", () => {
    assert.strictEqual(isCircularSentence("Leetcode is cool"), false);
  });
});
