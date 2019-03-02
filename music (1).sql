-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2019 at 06:36 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `music`
--

-- --------------------------------------------------------

--
-- Table structure for table `batch`
--

CREATE TABLE `batch` (
  `Batch_id` int(1) NOT NULL,
  `Batch_teacher_id` int(1) NOT NULL,
  `Batch_Student_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `batch1`
--

CREATE TABLE `batch1` (
  `batch_id` int(1) NOT NULL,
  `batch_student_id` int(4) NOT NULL,
  `batch_teacher_id` int(1) NOT NULL,
  `batch_no` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batch1`
--

INSERT INTO `batch1` (`batch_id`, `batch_student_id`, `batch_teacher_id`, `batch_no`) VALUES
(1, 1, 1, 0),
(5, 2, 6, 2);

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE `student_details` (
  `student_id` int(4) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Date_of_birth` varchar(10) NOT NULL,
  `Batch` int(2) NOT NULL,
  `Start_date` varchar(10) NOT NULL,
  `Contact` int(10) NOT NULL,
  `Parent_name` varchar(20) NOT NULL,
  `Parent_contact` int(10) NOT NULL,
  `Mother_tongue` varchar(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Exam_level` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`student_id`, `Name`, `Date_of_birth`, `Batch`, `Start_date`, `Contact`, `Parent_name`, `Parent_contact`, `Mother_tongue`, `Address`, `Exam_level`) VALUES
(1, 'Amey', '17/12/18', 1, '17/12/18', 875454545, 'sdfsf', 787878777, 'Marath', 'adfafd', 0),
(2, 'Tanvi', '27/12/18', 1, '27/12/18', 215454545, 'Dinesh', 987878777, 'Marathi', 'adfafd', 2);

-- --------------------------------------------------------

--
-- Table structure for table `teacher_type_table`
--

CREATE TABLE `teacher_type_table` (
  `teacher_id` int(1) NOT NULL,
  `teacher_name` varchar(30) NOT NULL,
  `teacher_instrument` varchar(30) NOT NULL,
  `Day` varchar(10) NOT NULL,
  `Day_start` time NOT NULL,
  `Day_end` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_type_table`
--

INSERT INTO `teacher_type_table` (`teacher_id`, `teacher_name`, `teacher_instrument`, `Day`, `Day_start`, `Day_end`) VALUES
(1, 'Mr. White', 'Guitar', 'Thursday', '09:00:00', '10:00:00'),
(2, 'Mr. Black', 'Piano', 'Saturday', '16:00:00', '17:00:00'),
(3, 'Mr. Red', 'Drums', 'Tuesday', '09:00:00', '10:00:00'),
(4, 'Mr. Blue', 'Violin', 'Sunday', '10:00:00', '11:00:00'),
(5, 'Mr. White', 'Guitar', 'Sunday', '00:00:00', '00:00:00'),
(6, 'Mr. Black', 'Piano', 'Tuesday', '10:00:00', '11:00:00'),
(7, 'Mr. Red', 'Drums', 'Saturday', '11:00:00', '12:00:00'),
(8, 'Mr. Blue', 'Violin', 'Thursday', '10:00:00', '11:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userid` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userid`, `username`, `password`, `admin`) VALUES
(1001, 'admin', '123', 1),
(1002, 'assistant', '12345', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `batch`
--
ALTER TABLE `batch`
  ADD PRIMARY KEY (`Batch_id`),
  ADD KEY `batch_ibfk_1` (`Batch_Student_id`),
  ADD KEY `batch_ibfk_2` (`Batch_teacher_id`);

--
-- Indexes for table `batch1`
--
ALTER TABLE `batch1`
  ADD PRIMARY KEY (`batch_id`),
  ADD UNIQUE KEY `uq_batch1` (`batch_student_id`,`batch_teacher_id`,`batch_no`) USING BTREE,
  ADD KEY `FK_teacher` (`batch_teacher_id`);

--
-- Indexes for table `student_details`
--
ALTER TABLE `student_details`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `teacher_type_table`
--
ALTER TABLE `teacher_type_table`
  ADD PRIMARY KEY (`teacher_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `batch`
--
ALTER TABLE `batch`
  MODIFY `Batch_id` int(1) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `batch1`
--
ALTER TABLE `batch1`
  MODIFY `batch_id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `student_details`
--
ALTER TABLE `student_details`
  MODIFY `student_id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `teacher_type_table`
--
ALTER TABLE `teacher_type_table`
  MODIFY `teacher_id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `batch1`
--
ALTER TABLE `batch1`
  ADD CONSTRAINT `FK_student` FOREIGN KEY (`batch_student_id`) REFERENCES `student_details` (`student_id`),
  ADD CONSTRAINT `FK_teacher` FOREIGN KEY (`batch_teacher_id`) REFERENCES `teacher_type_table` (`teacher_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
