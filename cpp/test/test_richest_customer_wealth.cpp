#include <iostream>
#include <vector>
#include <cassert>
#include "../src/richest_customer_wealth.cpp"

void test_two_sum_case1()
{
	std::vector<std::vector<int>> nums = {{1, 2, 3}, {3, 2, 1}};
	int result = maximumWealth(nums);
	assert(result == 6);
	std::cout << "Test case passed!" << std::endl;
}

void test_two_sum_case2()
{
	std::vector<std::vector<int>> nums = {{1, 5}, {7, 3}, {3, 5}};
	int result = maximumWealth(nums);
	assert(result == 10);
	std::cout << "Test case passed!" << std::endl;
}

void test_two_sum_case3()
{
	std::vector<std::vector<int>> nums = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
	int result = maximumWealth(nums);
	assert(result == 17);
	std::cout << "Test case passed!" << std::endl;
}

int main()
{
	test_two_sum_case1();
	test_two_sum_case2();
	test_two_sum_case3();
	return 0;
}