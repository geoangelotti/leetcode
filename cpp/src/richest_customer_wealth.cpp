#include <vector>
#include <numeric>

int maximumWealth(std::vector<std::vector<int>> &accounts)
{
	return std::transform_reduce(
		accounts.cbegin(),
		accounts.cend(),
		0,
		[](auto a, auto b)
		{ return std::max(a, b); },
		[](auto const &row)
		{ return std::reduce(row.cbegin(), row.cend()); });
}