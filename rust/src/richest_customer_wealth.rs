fn maximum_wealth(accounts: Vec<Vec<i32>>) -> i32 {
    accounts.iter().map(|x| x.iter().sum()).max().unwrap()
}

#[cfg(test)]
mod tests {
    use std::vec;

    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![vec![1, 2, 3], vec![3, 2, 1]], 6)]
    #[case(vec![vec![1, 5], vec![7, 3], vec![3, 5]], 10)]
    #[case(vec![vec![2, 8, 7], vec![7, 1, 3], vec![1, 9, 5]], 17)]
    fn test_maximum_wealth(#[case] accounts: Vec<Vec<i32>>, #[case] expected: i32) {
        let result = maximum_wealth(accounts);
        assert_eq!(result, expected);
    }
}
