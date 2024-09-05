const test = require("node:test");
const assert = require("node:assert/strict");
const Calculator = require("../src/CalculatorwithMethodChaining");

test("Calculator with Method Chaining", async (t) => {
  await t.test("add", () => {
    assert.strictEqual(new Calculator(10).add(5).subtract(7).getResult(), 8);
  });
  await t.test("power", () => {
    assert.strictEqual(new Calculator(2).multiply(5).power(2).getResult(), 100);
  });
  await t.test("division error", () => {
    assert.throws(
      () => {
        new Calculator(20).divide(0);
      },
      {
        name: "Error",
        message: "Division by zero is not allowed",
      }
    );
  });
});
