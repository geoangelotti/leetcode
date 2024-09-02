#![allow(dead_code)]

fn chalk_replacer(chalk: Vec<i32>, k: i32) -> i32 {
    let chalk_needed: i64 = chalk
        .iter()
        .try_fold(0_i64, |acc, &c| acc.checked_add(c as _))
        .unwrap();
    let mut remaining_chalk = (k as i64 % chalk_needed) as i32;
    for (i, &uses) in chalk.iter().enumerate() {
        if remaining_chalk < uses {
            return i as i32;
        }
        remaining_chalk -= uses;
    }
    0
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(vec![5,1,5], 22, 0)]
    #[case(vec![3,4,1,2], 25, 1)]
    fn test_chalk_replacer(#[case] chalk: Vec<i32>, #[case] k: i32, #[case] expected: i32) {
        let result = chalk_replacer(chalk, k);
        assert_eq!(result, expected);
    }
}
