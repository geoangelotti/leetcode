import test from "node:test";
import { strict as assert } from "node:assert";
import expect from "../src/ToBeOrNotToBe.mjs";

test("To Be Or Not To Be", async (t) => {
  await t.test("To Be true", () => {
    assert.strictEqual(expect(5).toBe(5), true);
  });
  await t.test("To Be Not Equal", () => {
    assert.throws(() => expect(5).toBe(null), {
      name: "Error",
      message: "Not Equal",
    });
  });
  await t.test("Not To Be true", () => {
    assert.strictEqual(expect(5).notToBe(null), true);
  });
});
