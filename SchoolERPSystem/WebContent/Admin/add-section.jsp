<%@ include file="header.jsp"%>
<div class="dashboard-content-one">
	<!-- Breadcubs Area Start Here -->
	<div class="breadcrumbs-area">
		<h3>Section</h3>
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li>Add New Section</li>
		</ul>
	</div>
	<!-- Breadcubs Area End Here -->
	<!-- Add New Book Area Start Here -->
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Add New Section</h3>
				</div>
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button"
						data-toggle="dropdown" aria-expanded="false">...</a>

					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="#"><i
							class="fas fa-times text-orange-red"></i>Close</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-cogs text-dark-pastel-green"></i>Edit</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
					</div>
				</div>
			</div>
			<form class="new-added-form">
				<div class="row">
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Section Name *</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-md-3 d-none d-xl-block form-group"></div>
					<div class="col-12 form-group mg-t-8">
						<button type="submit"
							class="btn-fill-lg btn-gradient-yellow btn-hover-bluedark">Save</button>
						<button type="reset"
							class="btn-fill-lg bg-blue-dark btn-hover-yellow">Reset</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<div class="col-8-xxxl col-12">
		<div class="card height-auto">
			<div class="card-body">
				<div class="heading-layout1">
					<div class="item-title">
						<h3>All Subjects</h3>
					</div>
					<div class="dropdown">
						<a class="dropdown-toggle" href="#" role="button"
							data-toggle="dropdown" aria-expanded="false">...</a>

						<div class="dropdown-menu dropdown-menu-right">
							<a class="dropdown-item" href="#"><i
								class="fas fa-times text-orange-red"></i>Close</a> <a
								class="dropdown-item" href="#"><i
								class="fas fa-cogs text-dark-pastel-green"></i>Edit</a> <a
								class="dropdown-item" href="#"><i
								class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
						</div>
					</div>
				</div>
				<form class="mg-b-20">
					<div class="row gutters-8">
						<div class="col-lg-4 col-12 form-group">
							<input type="text" placeholder="Search by Exam ..."
								class="form-control">
						</div>
						<div class="col-lg-3 col-12 form-group">
							<input type="text" placeholder="Search by Subject ..."
								class="form-control">
						</div>
						<div class="col-lg-3 col-12 form-group">
							<input type="text" placeholder="dd/mm/yyyy" class="form-control">
						</div>
						<div class="col-lg-2 col-12 form-group">
							<button type="submit" class="fw-btn-fill btn-gradient-yellow">SEARCH</button>
						</div>
					</div>
				</form>
				<div class="table-responsive">
					<table class="table display data-table text-nowrap">
						<thead>
							<tr>
								<th>
									<div class="form-check">
										<input type="checkbox" class="form-check-input checkAll">
										<label class="form-check-label">ID</label>
									</div>
								</th>
								<th>Subject Name</th>
								<!-- <th>Subject Type</th>
								<th>Class</th>
								<th>Date</th> -->
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									<div class="form-check">
										<input type="checkbox" class="form-check-input"> <label
											class="form-check-label">#0021</label>
									</div>
								</td>
								<td>Accounting</td>
								<!-- <td>Mathematics</td>
								<td>4</td>
								<td>02/05/2001</td> -->
								<td>
									<div class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown"
											aria-expanded="false"> <span
											class="flaticon-more-button-of-three-dots"></span>
										</a>
										<div class="dropdown-menu dropdown-menu-right">
											<a class="dropdown-item" href="#"><i
												class="fas fa-times text-orange-red"></i>Close</a> <a
												class="dropdown-item" href="#"><i
												class="fas fa-cogs text-dark-pastel-green"></i>Edit</a> <a
												class="dropdown-item" href="#"><i
												class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>




	<%@ include file="footer.jsp"%>